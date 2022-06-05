/**
 * @author Yu
 * @title: Main
 * @projectName VP
 * @date 2022/5/27 22:38
 */
public class Main {
    public static void main(String[] args) {
        IRecipe recipe = new Meat();//创建一道肉类菜
        RestaurantMenu menu = new RestaurantMenu(recipe);//将肉类菜初始化到菜单中
        menu.addRecipe(new Cabbage());//再添加一道蔬菜
        menu.display(new CustomerA());//顾客A开始访问菜单中的元素（菜）
    }
}
