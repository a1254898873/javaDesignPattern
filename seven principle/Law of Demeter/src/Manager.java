/**
 * @author Yu
 * @title: Manager
 * @projectName LOD
 * @date 2022/5/25 17:21
 */
public class Manager {
    private Cabbage cabbage;
    public Manager(Cabbage cabbage) {
        this.cabbage = cabbage;
    }
    public void getCabbageSaleMoney(){
        cabbage.saleRecord();
    }
}
