package main.java.util;

public class Query {
    public static final String SELECT_ADMIN_FROM_USER = "select username, password from user where role_id = 2;";
    public static final String SELECT_INFORMATION_FROM_USER = "select * from user where status <> -1;";
    public static final String SELECT_USER_WITH_ID = "select * from user where id = ?;";
    public static final String CREATE_USER_WITH_PARAMETERS = "insert into user (role_id, first_name, last_name, gender, date_of_birth, phone, address, email, username, password, status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String UPDATE_USER_WITH_ID = "update user set role_id = ?, first_name = ?, last_name = ?, gender = ?, date_of_birth = ?, phone = ?, address = ?, email = ?, username = ?, password = ?, status = ? where id = ?;";
//    public static final String DELETE_USER_WITH_ID = "delete from user where id = ?;";
    public static final String DELETE_USER_WITH_ID = "update user set status = -1 where id = ?;";

    public static final String SELECT_ALL_PRODUCT = "SELECT * FROM product_detail\n" +
            "JOIN product on product_detail.product_id = product.id\n" +
            "JOIN catalog on product.catalog_id = catalog.id\n" +
            "JOIN size on product_detail.size_id = size.id";


    public static final String SELECT_ALL_IMAGE_FROM_PRODUCT = "SELECT * FROM attachment\n" +
            "WHERE product_id = ?;";

    public static final String SELECT_PRODUCT_BY_ID = "SELECT *\n" +
            "FROM product_detail\n" +
            "         JOIN product on product_detail.product_id = product.id\n" +
            "         JOIN catalog on product.catalog_id = catalog.id\n" +
            "         JOIN size on product_detail.size_id = size.id " +
            "WHERE product_detail.id = ?;";

    public static final String SELECT_IMPORT_BY_PRODUCT_ID = "SELECT * FROM import\n" +
            "JOIN product_detail on import.product_detail_id = product_detail.id\n" +
            "WHERE product_detail_id = ?;";
}
