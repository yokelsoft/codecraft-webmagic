package us.codecraft.webmagic.model;


import java.util.List;
import us.codecraft.webmagic.Page;

/**
 * @author code4crafer@gmail.com
 * @since 0.5.2
 */
public class PageMapper<T> {

    private final Class<T> clazz;

    private final PageModelExtractor pageModelExtractor;

    public PageMapper(Class<T> clazz) {
        this.clazz = clazz;
        this.pageModelExtractor = PageModelExtractor.create(clazz);
    }

    @SuppressWarnings("unchecked")
    public T get(Page page) {
        Object result = pageModelExtractor.process(page);
        return (result != null && clazz.isAssignableFrom(result.getClass())) ? (T) result : null ;
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll(Page page) {
        Object result = pageModelExtractor.process(page);
        return (result instanceof List) ? (List<T>) pageModelExtractor.process(page) : null;
    }
}
