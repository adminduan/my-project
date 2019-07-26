///*
// * Copyright (c) 2011-2020, baomidou (jobob@qq.com).
// * <p>
// * Licensed under the Apache License, Version 2.0 (the "License"); you may not
// * use this file except in compliance with the License. You may obtain a copy of
// * the License at
// * <p>
// * https://www.apache.org/licenses/LICENSE-2.0
// * <p>
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// * License for the specific language governing permissions and limitations under
// * the License.
// */
//package com.mybatis.plus;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
///**
// * 代码生成器演示
// *
// * @author hubin
// * @since 2016-12-01
// */
//public class MysqlGeneratorDefault extends GeneratorTest {
//
//    /**
//     * MySQL 生成演示
//     */
//    public static void main(String[] args) {
//
//        String projectPath = System.getProperty("user.dir");
//        String outputDir = projectPath + "/src/main/java"; //生成文件输出目录
//        String author = "duanlsh"; //注释作者
//        String entityPrefix = "ProductCategory"; //生成文件的前缀
//        String tableName = "tbl_product_category"; //表名
//        String packageName = "com.apple"; //生成文件的 包名
//
//        //数据库
//        String dbUrl = "jdbc:mysql://localhost:3306/grainfull?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.MYSQL)
//                .setUrl(dbUrl)
//                .setUsername("root")
//                .setPassword("root")
//                .setDriverName("com.mysql.cj.jdbc.Driver");
//
//
//        GlobalConfig config = new GlobalConfig();
//        config.setAuthor(author);
//        config.setOutputDir(outputDir);
//        config.setFileOverride(true);
//        config.setOpen(false); //文件生成完是否打开目录
//        config.setEntityName(String.format("%sModel", entityPrefix));
//        config.setControllerName(String.format("%sController", entityPrefix));
//        config.setServiceName(String.format("%sService",entityPrefix));
//        config.setServiceImplName(String.format("%sServiceImpl",entityPrefix));
//        config.setMapperName(String.format("%sMapper", entityPrefix));
//        config.setXmlName(String.format("%sMapper", entityPrefix));
//
//
//
//
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig
//                .setCapitalMode(true)
//                .setEntityLombokModel(true) //设置是否使用 lombook
////                .setDbColumnUnderline(true)
//                .setNaming(NamingStrategy.underline_to_camel)
//                .setColumnNaming(NamingStrategy.underline_to_camel)
//                .setRestControllerStyle(true)
//                .setControllerMappingHyphenStyle(true)
////                .setSuperEntityClass("com.baomidou.mybatisplus.extension.service.impl.ServiceImpl")
////                .setSuperMapperClass("com.baomidou.mybatisplus.core.mapper.BaseMapper")
//                .setInclude(tableName)//修改替换成你需要的表名，多个表名传数组
//                ;
//
//        InjectionConfig cfg = new InjectionConfig() {
//            @Override
//            public void initMap() {
//                //do nothing
//            }
//        };
//
//        PackageConfig packageConfig = new PackageConfig();
////        packageConfig.setModuleName("ProductCategory"); //在parent包下面添加的包名 eg: com.apple.ProductCategory
//        packageConfig.setParent(packageName);
//        packageConfig.setController("controller");
//        packageConfig.setService("service");
//        packageConfig.setServiceImpl("service.impl");
//        packageConfig.setEntity("model");
//
//
//        AutoGenerator mpg = new AutoGenerator();
//        mpg.setGlobalConfig(config);
//        mpg.setDataSource(dataSourceConfig);
//        mpg.setStrategy(strategyConfig);
//        mpg.setCfg(cfg);
//        mpg.setPackageInfo(packageConfig);
//        mpg.execute();
//
//    }
//
//}
