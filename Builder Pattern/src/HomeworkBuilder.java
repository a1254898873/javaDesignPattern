/**
 * @author Yu
 * @title: HomeworkBuilder
 * @projectName BP
 * @date 2022/5/26 17:38
 */
public abstract class HomeworkBuilder {
    public abstract HomeworkBuilder buildEasyQc(String easyQc);

    public abstract HomeworkBuilder buildNormalQc(String normalQc);

    public abstract HomeworkBuilder buildMediumQc(String mediumQc);

    public abstract HomeworkBuilder buildHardQc(String hardQc);

    public abstract Homework build();
}
