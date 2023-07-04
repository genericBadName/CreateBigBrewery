package com.genericbadname.bigbrewery.content.processing.lid;

import com.genericbadname.bigbrewery.ModPartialModels;
import com.jozufozu.flywheel.api.MaterialManager;
import com.jozufozu.flywheel.api.instance.DynamicInstance;
import com.jozufozu.flywheel.core.Materials;
import com.jozufozu.flywheel.core.materials.oriented.OrientedData;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import com.simibubi.create.content.kinetics.base.ShaftInstance;
import com.simibubi.create.foundation.utility.AngleHelper;
import com.simibubi.create.foundation.utility.AnimationTickHolder;

public class LidInstance extends ShaftInstance<LidBlockEntity> implements DynamicInstance {
    private final OrientedData lidHead;

    public LidInstance(MaterialManager materialManager, LidBlockEntity blockEntity) {
        super(materialManager, blockEntity);

        lidHead = materialManager.defaultSolid()
                .material(Materials.ORIENTED)
                .getModel(ModPartialModels.LID_HEAD, blockState)
                .createInstance();

        Quaternion q = Vector3f.YP
                .rotationDegrees(AngleHelper.horizontalAngle(blockState.getValue(LidBlock.HORIZONTAL_FACING)));

        lidHead.setRotation(q);

        transformModels();
    }

    @Override
    public void beginFrame() {
        transformModels();
    }

    private void transformModels() {
        float renderedHeadOffset = getRenderedHeadOffset(blockEntity);

        lidHead.setPosition(getInstancePosition())
                .nudge(0, -renderedHeadOffset, 0);
    }

    private float getRenderedHeadOffset(LidBlockEntity be) {
        return be.getRenderedHeadOffset(AnimationTickHolder.getPartialTicks()) * LidRenderer.HEAD_OFFSET;
    }

    @Override
    public void updateLight() {
        super.updateLight();

        relight(pos, lidHead);
    }

    @Override
    public void remove() {
        super.remove();
        lidHead.delete();
    }
}
