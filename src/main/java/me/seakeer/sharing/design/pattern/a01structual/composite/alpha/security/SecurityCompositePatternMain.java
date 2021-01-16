package me.seakeer.sharing.design.pattern.a01structual.composite.alpha.security;

/**
 * SecurityCompositePatternMain;
 * 安全组合模式;
 * 组合叶子构件和容器构件成树形结构，描述整体与部分的关系;
 *
 * @author Seakeer;
 * @date 2020-03-12; 2018/8/17;
 * @see CompanyItem --> IAComponent 1 抽象构件;
 * @see Department  --> Composite   2 容器构件;
 * @see Staff       --> Leaf        3 叶子构件;
 */
public class SecurityCompositePatternMain {

    public static void main(String[] args) {
        Department company, product, development, business;
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

        //没有add方法
        //developer.add(business);

        company.showName();
        development.showName();
    }
}
