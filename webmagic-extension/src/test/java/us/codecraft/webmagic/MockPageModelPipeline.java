package us.codecraft.webmagic;

import org.junit.Assert;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

/**
 * @author code4crafter@gmail.com
 */
public class MockPageModelPipeline implements PageModelPipeline{
    @Override
    public void process(Object o, Task task) {
        Assert.assertNotNull(o);
    }
}
