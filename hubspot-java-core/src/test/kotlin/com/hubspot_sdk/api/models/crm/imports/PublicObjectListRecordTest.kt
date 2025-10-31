// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicObjectListRecordTest {

    @Test
    fun create() {
        val publicObjectListRecord =
            PublicObjectListRecord.builder().listId("3").objectType("contacts").build()

        assertThat(publicObjectListRecord.listId()).isEqualTo("3")
        assertThat(publicObjectListRecord.objectType()).isEqualTo("contacts")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectListRecord =
            PublicObjectListRecord.builder().listId("3").objectType("contacts").build()

        val roundtrippedPublicObjectListRecord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectListRecord),
                jacksonTypeRef<PublicObjectListRecord>(),
            )

        assertThat(roundtrippedPublicObjectListRecord).isEqualTo(publicObjectListRecord)
    }
}
