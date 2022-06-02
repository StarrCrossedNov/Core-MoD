// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFrog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "frog"), "main");
	private final ModelPart Body;
	private final ModelPart L1;
	private final ModelPart R1;
	private final ModelPart L2;
	private final ModelPart R2;

	public ModelFrog(ModelPart root) {
		this.Body = root.getChild("Body");
		this.L1 = root.getChild("L1");
		this.R1 = root.getChild("R1");
		this.L2 = root.getChild("L2");
		this.R2 = root.getChild("R2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(20, 21)
						.addBox(-3.0F, -9.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 21)
						.addBox(1.0F, -9.0F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -7.0F, -4.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 24.0F, 0.0F));

		PartDefinition L1 = partdefinition.addOrReplaceChild("L1",
				CubeListBuilder.create().texOffs(10, 26)
						.addBox(-0.25F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.25F, 3.0F, -3.5F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 21.0F, -2.0F));

		PartDefinition R1 = partdefinition.addOrReplaceChild("R1",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(-1.25F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 4)
						.addBox(-1.25F, 3.0F, -3.5F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 21.0F, -2.0F));

		PartDefinition L2 = partdefinition.addOrReplaceChild("L2",
				CubeListBuilder.create().texOffs(14, 14)
						.addBox(-1.0F, 0.0F, 4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 21.0F, -2.0F));

		PartDefinition R2 = partdefinition.addOrReplaceChild("R2",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-1.0F, 0.0F, 4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 14)
						.addBox(-2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 21.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.R2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.L1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.L2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.R1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}