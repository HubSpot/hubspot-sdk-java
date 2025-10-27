// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations

import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationBatchDeleteByObjectTypesParamsTest {

    @Test
    fun create() {
        ConfigurationBatchDeleteByObjectTypesParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicAssociationSpec(
                BatchInputPublicAssociationSpec.builder()
                    .addInput(
                        PublicAssociationSpec.builder().category("category").typeId(0).build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConfigurationBatchDeleteByObjectTypesParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationSpec(
                    BatchInputPublicAssociationSpec.builder()
                        .addInput(
                            PublicAssociationSpec.builder().category("category").typeId(0).build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConfigurationBatchDeleteByObjectTypesParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationSpec(
                    BatchInputPublicAssociationSpec.builder()
                        .addInput(
                            PublicAssociationSpec.builder().category("category").typeId(0).build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicAssociationSpec.builder()
                    .addInput(
                        PublicAssociationSpec.builder().category("category").typeId(0).build()
                    )
                    .build()
            )
    }
}
