package me.seakeer.sharing.design.pattern.a01structual.composite.alpha.open;

/**
 * OpenCompositePatternMain;
 * 透明组合模式：组合叶子构件和容器构件成树形结构，描述整体与部分的关系;
 * 容器构件与叶子构件;
 *
 * @author Seakeer;
 * @date 2020-03-12; 2018/8/17;
 * @see CompanyItem --> IAComponent 1 抽象构件;
 * @see Department  --> Composite   2 容器构件;
 * @see Staff       --> Leaf        3 叶子构件;
 */
public class OpenCompositePatternMain {

    public static void main(String[] args) {
        CompanyItem company, product, development, business;
        CompanyItem ceo, productManager, developer, businessManager;

        company = new Department("范特西");
        product = new Department("产品部");
        development = new Department("研发部");
        business = new Department("商业部");

        ceo = new Staff("CEO");
        productManager = new Staff("产品经理");
        developer = new Staff("开发者");
        businessManager = new Staff("商业经理");

        company.add(product);
        company.add(development);
        company.add(business);

        company.add(ceo);

        product.add(productManager);
        development.add(developer);
        business.add(businessManager);

        //Not Support
        developer.add(business);

        company.showName();
        product.showName();
    }
}
