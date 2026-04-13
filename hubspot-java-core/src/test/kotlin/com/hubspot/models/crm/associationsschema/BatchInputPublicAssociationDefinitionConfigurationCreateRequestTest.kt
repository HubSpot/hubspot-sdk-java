// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicAssociationDefinitionConfigurationCreateRequestTest {

    @Test
    fun create() {
        val batchInputPublicAssociationDefinitionConfigurationCreateRequest =
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

        assertThat(batchInputPublicAssociationDefinitionConfigurationCreateRequest.inputs())
            .containsExactly(
                PublicAssociationDefinitionConfigurationCreateRequest.builder()
                    .category(
                        PublicAssociationDefinitionConfigurationCreateRequest.Category
                            .HUBSPOT_DEFINED
                    )
                    .maxToObjectIds(0)
                    .typeId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicAssociationDefinitionConfigurationCreateRequest =
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

        val roundtrippedBatchInputPublicAssociationDefinitionConfigurationCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchInputPublicAssociationDefinitionConfigurationCreateRequest
                ),
                jacksonTypeRef<BatchInputPublicAssociationDefinitionConfigurationCreateRequest>(),
            )

        assertThat(roundtrippedBatchInputPublicAssociationDefinitionConfigurationCreateRequest)
            .isEqualTo(batchInputPublicAssociationDefinitionConfigurationCreateRequest)
    }
}
