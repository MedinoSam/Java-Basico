package set.operacoesBasicas;

public class Palavra {
    private String frase;

    public Palavra(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "Palavra [frase=" + frase + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((frase == null) ? 0 : frase.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Palavra other = (Palavra) obj;
        if (frase == null) {
            if (other.frase != null)
                return false;
        } else if (!frase.equals(other.frase))
            return false;
        return true;
    }

    
    
}
