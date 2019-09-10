package shaders;

import org.lwjgl.util.vector.Matrix4f;

public class StaticShader extends ShaderProgram{

	private static final String vertex_file = "src/shaders/vertexShader.txt";
	private static final String fragment_file = "src/shaders/fragmentShader.txt";
	
	private int loaction_transformationMatrix;
	
	public StaticShader() {
		super(vertex_file, fragment_file);
	}

	protected void bindAttributes() {
		super.bindAttributes(0, "position");
		super.bindAttributes(1, "texture_coords");
	}

	
	protected void getAlluniformLocations() {
		super.getUniformLocation("transformationMatrix");
		
	}
	
	public void loadTransformationMatrix(Matrix4f matrix) {
		super.loadMatrix(loaction_transformationMatrix, matrix);
	}
}
