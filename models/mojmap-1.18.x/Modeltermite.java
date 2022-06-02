// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltermite<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "termite"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart L1;
	private final ModelPart L2;
	private final ModelPart L3;
	private final ModelPart R1;
	private final ModelPart R2;
	private final ModelPart R3;

	public Modeltermite(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.L1 = root.getChild("L1");
		this.L2 = root.getChild("L2");
		this.L3 = root.getChild("L3");
		this.R1 = root.getChild("R1");
		this.R2 = root.getChild("R2");
		this.R3 = root.getChild("R3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -6.0F, 1.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-1.0F, -5.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-2.0F, -2.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-1.0F, 0.75F, -6.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(1.0F, 0.75F, -6.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, -1.0F));

		PartDefinition cube_r1 = Head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(4, 0).addBox(-1.0F, -8.0F, -4.0F, 1.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r2 = Head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(4, 3).addBox(0.0F, -8.0F, -4.0F, 1.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition L1 = partdefinition.addOrReplaceChild("L1", CubeListBuilder.create(),
				PartPose.offset(1.0F, 21.0F, -1.0F));

		PartDefinition cube_r3 = L1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 18).addBox(2.0F, -3.0F, -1.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition L2 = partdefinition.addOrReplaceChild("L2", CubeListBuilder.create(),
				PartPose.offset(2.0F, 21.0F, 2.0F));

		PartDefinition cube_r4 = L2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(4, 18).addBox(2.5F, -2.75F, 2.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, -2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition L3 = partdefinition.addOrReplaceChild("L3", CubeListBuilder.create(),
				PartPose.offset(2.0F, 21.0F, 5.0F));

		PartDefinition cube_r5 = L3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 18).addBox(2.5F, -2.75F, 5.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, -5.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition R1 = partdefinition.addOrReplaceChild("R1", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 21.0F, -1.0F));

		PartDefinition cube_r6 = R1
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(16, 15).addBox(-3.0F, -3.0F, -1.0F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition R2 = partdefinition.addOrReplaceChild("R2", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 21.0F, 2.0F));

		PartDefinition cube_r7 = R2
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(16, 10).addBox(-3.5F, -2.75F, 2.0F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition R3 = partdefinition.addOrReplaceChild("R3", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 21.0F, 5.0F));

		PartDefinition cube_r8 = R3
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -2.75F, 5.0F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 3.0F, -5.0F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.R2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.R3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.L1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.L2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.L3.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.R1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}