// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMigrationMappingTest {

    @Test
    fun create() {
        val publicMigrationMapping =
            PublicMigrationMapping.builder().legacyListId("legacyListId").listId("listId").build()

        assertThat(publicMigrationMapping.legacyListId()).isEqualTo("legacyListId")
        assertThat(publicMigrationMapping.listId()).isEqualTo("listId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMigrationMapping =
            PublicMigrationMapping.builder().legacyListId("legacyListId").listId("listId").build()

        val roundtrippedPublicMigrationMapping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMigrationMapping),
                jacksonTypeRef<PublicMigrationMapping>(),
            )

        assertThat(roundtrippedPublicMigrationMapping).isEqualTo(publicMigrationMapping)
    }
}
