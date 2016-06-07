package testeaes;


public class MetodosAES {
    
    //Sbox utilizada para a excpanção da chave
                                //     0     1     2     3     4     5     6     7     8     9     A     B     C     D     E     F   
    private static int[][] sbox = { {0x63, 0x7C, 0x77, 0x7B, 0xF2, 0x6B, 0x6F, 0xC5, 0x30, 0x01, 0x67, 0x2B, 0xFE, 0xD7, 0xAB, 0x76},   // 0
                                    {0xCA, 0x82, 0xC9, 0x7D, 0xFA, 0x59, 0x47, 0xF0, 0xAD, 0xD4, 0xA2, 0xAF, 0x9C, 0xA4, 0x72, 0xC0},   // 1
                                    {0xB7, 0xFD, 0x93, 0x26, 0x36, 0x3F, 0xF7, 0xCC, 0x34, 0xA5, 0xE5, 0xF1, 0x71, 0xD8, 0x31, 0x15},   // 2
                                    {0x04, 0xC7, 0x23, 0xC3, 0x18, 0x96, 0x05, 0x9A, 0x07, 0x12, 0x80, 0xE2, 0xEB, 0x27, 0xB2, 0x75},   // 3
                                    {0x09, 0x83, 0x2C, 0x1A, 0x1B, 0x6E, 0x5A, 0xA0, 0x52, 0x3B, 0xD6, 0xB3, 0x29, 0xE3, 0x2F, 0x84},   // 4
                                    {0x53, 0xD1, 0x00, 0xED, 0x20, 0xFC, 0xB1, 0x5B, 0x6A, 0xCB, 0xBE, 0x39, 0x4A, 0x4C, 0x58, 0xCF},   // 5
                                    {0xD0, 0xEF, 0xAA, 0xFB, 0x43, 0x4D, 0x33, 0x85, 0x45, 0xF9, 0x02, 0x7F, 0x50, 0x3C, 0x9F, 0xA8},   // 6
                                    {0x51, 0xA3, 0x40, 0x8F, 0x92, 0x9D, 0x38, 0xF5, 0xBC, 0xB6, 0xDA, 0x21, 0x10, 0xFF, 0xF3, 0xD2},   // 7
                                    {0xCD, 0x0C, 0x13, 0xEC, 0x5F, 0x97, 0x44, 0x17, 0xC4, 0xA7, 0x7E, 0x3D, 0x64, 0x5D, 0x19, 0x73},   // 8
                                    {0x60, 0x81, 0x4F, 0xDC, 0x22, 0x2A, 0x90, 0x88, 0x46, 0xEE, 0xB8, 0x14, 0xDE, 0x5E, 0x0B, 0xDB},   // 9
                                    {0xE0, 0x32, 0x3A, 0x0A, 0x49, 0x06, 0x24, 0x5C, 0xC2, 0xD3, 0xAC, 0x62, 0x91, 0x95, 0xE4, 0x79},   // A
                                    {0xE7, 0xC8, 0x37, 0x6D, 0x8D, 0xD5, 0x4E, 0xA9, 0x6C, 0x56, 0xF4, 0xEA, 0x65, 0x7A, 0xAE, 0x08},   // B
                                    {0xBA, 0x78, 0x25, 0x2E, 0x1C, 0xA6, 0xB4, 0xC6, 0xE8, 0xDD, 0x74, 0x1F, 0x4B, 0xBD, 0x8B, 0x8A},   // C
                                    {0x70, 0x3E, 0xB5, 0x66, 0x48, 0x03, 0xF6, 0x0E, 0x61, 0x35, 0x57, 0xB9, 0x86, 0xC1, 0x1D, 0x9E},   // D
                                    {0xE1, 0xF8, 0x98, 0x11, 0x69, 0xD9, 0x8E, 0x94, 0x9B, 0x1E, 0x87, 0xE9, 0xCE, 0x55, 0x28, 0xDF},   // E
                                    {0x8C, 0xA1, 0x89, 0x0D, 0xBF, 0xE6, 0x42, 0x68, 0x41, 0x99, 0x2D, 0x0F, 0xB0, 0x54, 0xBB, 0x16} }; // F
    
    private static int [][] matMix = {{02,03,01,01},
                                      {01,02,03,01},
                                      {01,01,02,03},
                                      {03,01,01,02}};

    //bloco utilizado para testes
    public int  bloco [][] = {{0x32,0x88,0x31,0xE0},
                              {0x43,0x5A,0x31,0x37},
                              {0xF6,0x30,0x98,0x07},
                              {0xA8,0x8D,0xA2,0x34}};
    
    public int  chave [][] = {{0x2B,0x28,0xAB,0x09},
                              {0x7E,0xAE,0xF7,0xCF},
                              {0x15,0xD2,0x15,0x4F},
                              {0x16,0xA6,0x88,0x3C}};
    
    public int [][] ExChave(int [][] chave){
        int[][] roundKey = new int[4][44];
        for (int c = 0; c < 4; c++) {
        //colocar os metodos aqui dentro!!   
        }
        return roundKey;
    }
    
    
    
    //funcionando com Byte! :)
    public int[][] ShiftRows(int[][] stado) {
        int[][] aux = new int[4][4];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++){
                aux[l][c] = stado [l][(c + l) % 4];
            }
        }
        return aux;
    }
    
    //Funcionando só que preciso deixae a saida em hexadecimal / ta saindo em decimal
    public int[][] addRoundKey(int[][] chave, int[][] estado ){
        int[][] aux = new int[4][4];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++){
                aux[l][c] = (byte) ((chave[l][c]) ^ (estado[l][c]));
            }
        }
        return aux;
    }
    
    //Funcionando!!! Testado PRECISA VER O ESTOURO DE REPRESENTAÇão!
    public int [][] subBytes(int[][] estado){
        int [][] aux = new int [4][4];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++){
                aux[l][c] =  (sbox[this.retornaLinha(estado[l][c])][this.retornaColuna(estado[l][c])]);
            }
        }
        return aux;
    }
    
    //Testas acontece alguns bugs mas acho que é na operação de multiplicação Gmul
    public int [][] micColumns(int [][] estado){
        int [][] aux = new int [4][4];
        for(int c = 0; c < 4; c++){        
            //https://en.wikipedia.org/wiki/Rijndael_mix_columns
            aux[0][c] =  (this.GMul(0x02,  estado[0][c]) ^ this.GMul(0x03 , estado[1][c]) ^ this.GMul(0x01 , estado[2][c])^ this.GMul(0x01 , estado[3][c]));
            aux[1][c] =  (this.GMul(0x01,  estado[0][c]) ^ this.GMul(0x02 , estado[1][c]) ^ this.GMul(0x03 , estado[2][c])^ this.GMul(0x01 , estado[3][c]));
            aux[2][c] =  (this.GMul(0x01,  estado[0][c]) ^ this.GMul(0x01 , estado[1][c]) ^ this.GMul(0x02 , estado[2][c])^ this.GMul(0x03 , estado[3][c]));
            aux[3][c] =  (this.GMul(0x03,  estado[0][c]) ^ this.GMul(0x01 , estado[1][c]) ^ this.GMul(0x01 , estado[2][c])^ this.GMul(0x02 , estado[3][c]));
            /* 
            a00 = 2*a00 ^ 3*a10 ^ 1*a20 ^ 1*a30
            a10 = 1*a00 ^ 2*a10 ^ 3*a20 ^ 1*a30
            a20 = 1*a00 ^ 1*a10 ^ 2*a20 ^ 3*a30
            a30 = 3*a00 ^ 1*a10 ^ 1*a20 ^ 2*a30
            */
         }
        return aux;
    }
    
    //método para imprimir matrz em forma de bloco aes
    public void printMat(int [][] bloco){
        for(int a = 0; a < 4; a++){
            System.out.println();
            for(int b = 0; b < 4; b++){
                System.out.printf("%d - ", bloco[a][b]);
            }
            
        }
    }
    
    public int retornaColuna(int x){
        int a;
        a = x & 0x0F;
        return a;
    }
    
    public int retornaLinha(int x){
        int a;
        a = (x>>4) & 0x0f;
        return a;
    }
    
    //testar talvez não esteja funcionando corretamente
    public int GMul(int n, int x) { 
        int aux = 0;
        if(n == 1){
            aux = x;
        }
        if(n == 2){
            aux = (byte) (x<<1);
        }
        if(n == 3){
            aux = (byte) ((byte) (x<<1) ^ x);
        }
        
        if(aux > 255){
            aux = (byte) (x ^ 0x1B); 
        }
        return aux;
    }
    
    //Funcionando!! Testado!
    public int [][] rotacionaPalavra(int [][] chave){
        int [][] aux = new int [4][4];
        //aux = chave;
        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 3; c++){
                aux[l][c] = chave[l][c];
            } 
        }
        for(int l = 0; l < 4; l++){
           aux[l][3] = chave [(l+1) % 4][3];
        }
        return aux;
    }
    
    
}
