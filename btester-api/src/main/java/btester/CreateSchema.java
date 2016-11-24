package btester;

import btester.dao.ProductDao;
import btester.dao.TestDao;
import btester.model.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.EnumSet;

/**
 * @author Yuri Yerokhin
 * @version 1.0
 * @since 24.11.2016
 */
public class CreateSchema {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("create-schema.xml");
//        LocalSessionFactoryBean factoryBean = ctx.getBean(LocalSessionFactoryBean.class);
//        ServiceRegistry serviceRegistry = factoryBean.getConfiguration().getStandardServiceRegistryBuilder().build();
//        Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();
//        SchemaExport schema = new SchemaExport();
//        schema.create(EnumSet.of(TargetType.DATABASE), metadata);
        ProductDao dao = ctx.getBean(ProductDao.class);
        dao.list();
    }
}
