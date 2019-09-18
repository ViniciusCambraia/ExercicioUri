public class Uri {		
	
	private String urlt;
	private String nome;
	private String posicao;
	private String pais;
	private String uni;
	private String data ;
	private String ponto;
	private String res;
	private String tent;
	private String submissao;
	
	public String getUrlt() {
		return urlt;
	}
	public void setUrlt(String urlt) {
		this.urlt = urlt;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPonto() {
		return ponto;
	}
	public void setPonto(String ponto) {
		this.ponto = ponto;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public String getTent() {
		return tent;
	}
	public void setTent(String tent) {
		this.tent = tent;
	}
	public String getSubmissao() {
		return submissao;
	}
	public void setSubmissao(String submissao) {
		this.submissao = submissao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Uri posicao=");
		builder.append(posicao.substring(0,7));
		builder.append(",\n pais=");
		builder.append(pais.substring(53,55));
		builder.append(",\n uni=");
		builder.append(uni.substring(75, 79));
		builder.append(",\n data=");
		builder.append(data);
		builder.append(",\n ponto=");
		builder.append(ponto);
		builder.append(",\n res=");
		builder.append(res);
		builder.append(",\n tent=");
		builder.append(tent);
		builder.append(",\n submissao=");
		builder.append(submissao);
		return builder.toString();
	}
	
		
	
}
