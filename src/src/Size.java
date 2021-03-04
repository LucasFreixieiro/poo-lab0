/**
 * Enumerado Size qu contêm os tamanhos e as suas características
 */
public enum Size {

    SMALL(32, 36, "Pequeno",'S'),
    MEDIUM(37, 44, "Médio",'M'),
    LARGE(45, 52, "Grande",'L');
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;

    /**
     * Construtor do Size
     * @param minValue Valor minímo
     * @param maxValue Valor máximo
     * @param description Descrição do tamanho
     * @param code Código do tamanho
     */
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }

    /**
     * Obtem a descrição de forma padrão
     * @return Descrição
     */
    @Override
    public String toString() {
        return this.description;
    }

    /**
     * Obter a descrição do tamanho
     * @return Descrição do tamanho
     */
    public String getDescription() {
        return description;
    }

    /**
     * Obtem o valor minimo do tamanho
     * @return Valor Minimo
     */
    public int getMinValue() {
        return minValue;
    }

    /**
     * Obtem o valor máximo do tamanho
     * @return Valor Máximo
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * Obter o código do tamanho
     * @return Código do tamanho
     */
    public char getCode() {
        return code;
    }

}