package me.seakeer.sharing.design.pattern.a02behavioral.visitor.jdk;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.List;
import java.util.Set;

/**
 * VisitorPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-05-04;
 * @see javax.lang.model.element.Element            --> IAElement        1   抽象元素;
 * @see javax.lang.model.element.TypeElement        --> ConcreteElement  2_A 具体元素;
 * @see javax.lang.model.element.ExecutableElement  --> ConcreteElement  2_B 具体元素;
 * @see javax.lang.model.element.ElementVisitor     --> AVisitor         3   抽象访问者;
 * @see javax.lang.model.util.SimpleElementVisitor8 --> ConcreteVisitor  3_A 具体访问者;
 * @see javax.lang.model.util.ElementScanner8       --> ConcreteVisitor  3_B 具体访问者;
 * @see ...                                         --> ObjectStructure  4   对象结构;
 */
public class VisitorPatternJdk extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Set<? extends Element> rootElements = roundEnv.getRootElements();
        rootElements.forEach(rootElement -> {
            Element enclosingElement = rootElement.getEnclosingElement();
            List<? extends Element> enclosedElements = rootElement.getEnclosedElements();
        });
        return false;
    }
}
