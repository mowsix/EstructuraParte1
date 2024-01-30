class Fecha {

    int anno;
    int mes;
    int dia;

    public Fecha(int a, int m, int d) {
        anno=a;
        mes=m;
        dia=d;
    }



    public void setMes(int m) throws Exception{
        if(m<1 || m<12)
            throw new Exception("Valor invalido");
        mes=m;
    }





    public boolean esBiciesto(){
        boolean es = false;
        if (this.anno%4 == 0 && this.anno%100 !=0 ) es = true;
        return es;
    }



    //
    public static void main(String[] args) throws Exception {
        Fecha f1= new Fecha(2024,1,25);
        assert (f1.esBiciesto());

        Fecha f2= new Fecha(2028,1,25);
        assert (f2.esBiciesto());



    }



}
