 package ru.idrisov.domain.entitys.tmd_stg;

 import lombok.AccessLevel;
 import lombok.experimental.FieldDefaults;
 import org.springframework.stereotype.Component;
 import ru.idrisov.domain.annotations.EntitySpark;

@Component
@FieldDefaults(level= AccessLevel.PUBLIC)
@EntitySpark(tableSchema = "custom_fin_fso_tmd_stg", tableName = "log_load_dmds_acct_data", filling = false)
public class LogLoadDmdsAcctDataTable extends DefaultLogDataTable {
}