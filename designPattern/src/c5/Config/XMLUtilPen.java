package c5.Config;

            import javax.xml.parsers.DocumentBuilder;
            import javax.xml.parsers.DocumentBuilderFactory;
            import org.w3c.dom.Document;
            import org.w3c.dom.Node;
            import org.w3c.dom.NodeList;

            public class XMLUtilPen {
                public static Object getBean(String beanType) {
                    try {
                        // 创建文档对象
                        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder builder = dFactory.newDocumentBuilder();
                        Document doc;
                        doc = builder.parse(XMLUtilPen.class.getResourceAsStream("config.xml"));

                        // 获取包含类名的文本节点
                        NodeList nl = doc.getElementsByTagName(beanType);
                        Node classNode = nl.item(0).getFirstChild();
                        String className = classNode.getNodeValue().trim();

                        // 通过类名生成实例对象并返回
                        Class<?> c = Class.forName(className);
                        return c.getDeclaredConstructor().newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }