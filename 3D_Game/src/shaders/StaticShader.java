package shaders;

public class StaticShader extends ShaderProgram{

	private static final String vertex_file = "src/shaders/vertexShader.txt";
	private static final String fragment_file = "src/shaders/fragmentShader.txt";
	
	
	public StaticShader() {
		super(vertex_file, fragment_file);
	}

	protected void bindAttributes() {
		super.bindAttributes(0, "position");
		super.bindAttributes(1, "texture_coords");
	}

}
