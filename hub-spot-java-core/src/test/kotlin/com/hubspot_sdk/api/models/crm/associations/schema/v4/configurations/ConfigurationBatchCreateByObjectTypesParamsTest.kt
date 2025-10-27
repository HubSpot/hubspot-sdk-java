// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations

import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationBatchCreateByObjectTypesParamsTest {

    @Test
    fun create() {
        ConfigurationBatchCreateByObjectTypesParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicAssociationDefinitionConfigurationCreateRequest(
                BatchInputPublicAssociationDefinitionConfigurationCreateRequest.builder()
                    .addInput(
                        PublicAssociationDefinitionConfigurationCreateRequest.builder()
                            .category(
                                PublicAssociationDefinitionConfigurationCreateRequest.Category
                                    .HUBSPOT_DEFINED
                            )
                            .maxToObjectIds(0)
                            .typeId(0)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConfigurationBatchCreateByObjectTypesParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationDefinitionConfigurationCreateRequest(
                    BatchInputPublicAssociationDefinitionConfigurationCreateRequest.builder()
                        .addInput(
                            PublicAssociationDefinitionConfigurationCreateRequest.builder()
                                .category(
                                    PublicAssociationDefinitionConfigurationCreateRequest.Category
                                        .HUBSPOT_DEFINED
                                )
                                .maxToObjectIds(0)
                                .typeId(0)
                                .build()
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
            ConfigurationBatchCreateByObjectTypesParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationDefinitionConfigurationCreateRequest(
                    BatchInputPublicAssociationDefinitionConfigurationCreateRequest.builder()
                        .addInput(
                            PublicAssociationDefinitionConfigurationCreateRequest.builder()
                                .category(
                                    PublicAssociationDefinitionConfigurationCreateRequest.Category
                                        .HUBSPOT_DEFINED
                                )
                                .maxToObjectIds(0)
                                .typeId(0)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicAssociationDefinitionConfigurationCreateRequest.builder()
                    .addInput(
                        PublicAssociationDefinitionConfigurationCreateRequest.builder()
                            .category(
                                PublicAssociationDefinitionConfigurationCreateRequest.Category
                                    .HUBSPOT_DEFINED
                            )
                            .maxToObjectIds(0)
                            .typeId(0)
                            .build()
                    )
                    .build()
            )
    }
}
