// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations

import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationBatchUpdateParamsTest {

    @Test
    fun create() {
        ConfigurationBatchUpdateParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .batchInputPublicAssociationDefinitionConfigurationUpdateRequest(
                BatchInputPublicAssociationDefinitionConfigurationUpdateRequest.builder()
                    .addInput(
                        PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                            .category(
                                PublicAssociationDefinitionConfigurationUpdateRequest.Category
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
            ConfigurationBatchUpdateParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationDefinitionConfigurationUpdateRequest(
                    BatchInputPublicAssociationDefinitionConfigurationUpdateRequest.builder()
                        .addInput(
                            PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                                .category(
                                    PublicAssociationDefinitionConfigurationUpdateRequest.Category
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
            ConfigurationBatchUpdateParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationDefinitionConfigurationUpdateRequest(
                    BatchInputPublicAssociationDefinitionConfigurationUpdateRequest.builder()
                        .addInput(
                            PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                                .category(
                                    PublicAssociationDefinitionConfigurationUpdateRequest.Category
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
                BatchInputPublicAssociationDefinitionConfigurationUpdateRequest.builder()
                    .addInput(
                        PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                            .category(
                                PublicAssociationDefinitionConfigurationUpdateRequest.Category
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
