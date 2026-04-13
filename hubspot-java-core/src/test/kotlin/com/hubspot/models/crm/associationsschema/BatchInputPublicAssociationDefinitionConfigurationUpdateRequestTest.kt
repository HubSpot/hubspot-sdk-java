// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicAssociationDefinitionConfigurationUpdateRequestTest {

    @Test
    fun create() {
        val batchInputPublicAssociationDefinitionConfigurationUpdateRequest =
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

        assertThat(batchInputPublicAssociationDefinitionConfigurationUpdateRequest.inputs())
            .containsExactly(
                PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                    .category(
                        PublicAssociationDefinitionConfigurationUpdateRequest.Category
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
        val batchInputPublicAssociationDefinitionConfigurationUpdateRequest =
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

        val roundtrippedBatchInputPublicAssociationDefinitionConfigurationUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchInputPublicAssociationDefinitionConfigurationUpdateRequest
                ),
                jacksonTypeRef<BatchInputPublicAssociationDefinitionConfigurationUpdateRequest>(),
            )

        assertThat(roundtrippedBatchInputPublicAssociationDefinitionConfigurationUpdateRequest)
            .isEqualTo(batchInputPublicAssociationDefinitionConfigurationUpdateRequest)
    }
}
