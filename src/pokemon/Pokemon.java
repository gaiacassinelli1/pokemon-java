package pokemon;

public class Pokemon {
    
    private int pos;
    private String nome;
    private String tipo1;
    private String tipo2;
    private int bst;
    private int hp;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int spd;
    private int gen;
    private boolean leggendario;

    //COSTRUTTORE
    Pokemon(String row) {
        this.pos = Integer.parseInt(row.split(",")[0]);
        this.nome = row.split(",")[1];
        this.tipo1 = row.split(",")[2];
        this.tipo2 = row.split(",")[3];
        this.bst = Integer.parseInt(row.split(",")[4]);
        this.hp = Integer.parseInt(row.split(",")[5]);
        this.atk = Integer.parseInt(row.split(",")[6]);
        this.def = Integer.parseInt(row.split(",")[7]);
        this.spAtk = Integer.parseInt(row.split(",")[8]);
        this.spDef = Integer.parseInt(row.split(",")[9]);
        this.spd = Integer.parseInt(row.split(",")[10]);
        this.gen = Integer.parseInt(row.split(",")[11]);
        this.leggendario = Boolean.parseBoolean(row.split(",")[12]);
    }

    /*String legg(boolean leggendario) {
        if (leggendario) {
            return "LEGGENDARIO";
        } else {
            return "";
        }
    }*/

    public String scheda() {
        return 
        "\n\t#---------------------------------------#" +
        "\n\t| " + nome.toUpperCase() +"\t        HP: " + hp + "\t\t|" +
        "\n\t|---------------------------------------|" + 
        "\n\t|  //////////////////" + "                   |" + 
        "\n\t|  |    <      >    |" + "     Stats:" + "        |" +
        "\n\t|  |  <          >  |" + "     ATK: " + atk + "\t|" +
        "\n\t|  | <____________> |" + "     DEF: " + def + "\t|" +
        "\n\t|  |<_____(__)_____>|" + "     SP. ATK: " + spAtk + "\t|" +
        "\n\t|  | <            > |" + "     SP. DEF: " + spDef + "\t|" +
        "\n\t|  |  <          >  |" + "     SPE: " + spd + "\t|" +
        "\n\t|  |    <      >    |" + "     BST: " + bst + "\t|" +
        "\n\t|  //////////////////" + "                   |" + 
        "\n\t|---------------------------------------|" + 
        "\n\t| " + tipo1 + (" ".equals(tipo2) ? "\t\t\t\t        |" : (" / " + tipo2 + "\t\t\t\t|")) +   
        "\n\t|---------------------------------------|" +
        "\n\t| n. " + pos + (pos<100 ? ("\t\t\t\tGen. " + gen + "  |") : ("\t\t\tGen. " + gen + "  |")) +
        "\n\t|---------------------------------------|" +
        "\n\t|\t      " + (leggendario ? "LEGGENDARIO\t\t|" : "                          |") +
        "\n\t#---------------------------------------#\n\n\n\n"
        ;
    }


    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getBst() {
        return bst;
    }

    public void setBst(int bst) {
        this.bst = bst;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    public boolean isLeggendario() {
        return leggendario;
    }

    public void setLeggendario(boolean leggendario) {
        this.leggendario = leggendario;
    }

}

