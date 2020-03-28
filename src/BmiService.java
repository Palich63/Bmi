public class BmiService {
    public float calculate (float weight, float height){
        float bmi = weight / ((height*2) / 100);
        return bmi;
    }
}
