public class BoardPath {
    public static void boardPath(int curr, int end, String path) {
        if (curr==end) {
            System.out.println(path);
            return;
        }
        if(curr>end){
            return ;
        }
        for(int dice = 1; dice <= 6; dice++){
            boardPath(curr+dice, end, path+dice);
        }
    }
    public static void main(String[] args) {
        boardPath(0, 3, "");
    }
}
