/**
 * @author Yu
 * @title: Main
 * @projectName BP
 * @date 2022/5/26 17:33
 */
public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework();
        HomeworkBuilder homeworkBuilder = new ConcreateBuilder(homework);
        homeworkBuilder.buildEasyQc("我是一道简单题目")
                .buildNormalQc("我是一道标准难度题目")
                .buildMediumQc("我是一道中等难度题目")
                .buildHardQc("我是一道高难度题目");
        homework = homeworkBuilder.build();

        StringBuilder sb = new StringBuilder();
        sb.append(null == homework.getEasyQc() ? "" : homework.getEasyQc() + ",");
        sb.append(null == homework.getNormalQc() ? "" : homework.getNormalQc() + ",");
        sb.append(null == homework.getMediumQc() ? "" : homework.getMediumQc() + ",");
        sb.append(null == homework.getHardQc() ? "" : homework.getHardQc());

        System.out.println("我的家庭作业有：" + sb.toString());
    }
}
