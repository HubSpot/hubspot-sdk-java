// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBatchMigrationMappingTest {

    @Test
    fun create() {
        val publicBatchMigrationMapping =
            PublicBatchMigrationMapping.builder()
                .addLegacyListIdsToIdsMapping(
                    PublicMigrationMapping.builder()
                        .legacyListId("legacyListId")
                        .listId("listId")
                        .build()
                )
                .addMissingLegacyListId("string")
                .build()

        assertThat(publicBatchMigrationMapping.legacyListIdsToIdsMapping())
            .containsExactly(
                PublicMigrationMapping.builder()
                    .legacyListId("legacyListId")
                    .listId("listId")
                    .build()
            )
        assertThat(publicBatchMigrationMapping.missingLegacyListIds()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBatchMigrationMapping =
            PublicBatchMigrationMapping.builder()
                .addLegacyListIdsToIdsMapping(
                    PublicMigrationMapping.builder()
                        .legacyListId("legacyListId")
                        .listId("listId")
                        .build()
                )
                .addMissingLegacyListId("string")
                .build()

        val roundtrippedPublicBatchMigrationMapping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBatchMigrationMapping),
                jacksonTypeRef<PublicBatchMigrationMapping>(),
            )

        assertThat(roundtrippedPublicBatchMigrationMapping).isEqualTo(publicBatchMigrationMapping)
    }
}
