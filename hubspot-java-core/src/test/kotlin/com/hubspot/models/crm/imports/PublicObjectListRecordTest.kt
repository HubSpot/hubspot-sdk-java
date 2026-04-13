// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicObjectListRecordTest {

    @Test
    fun create() {
        val publicObjectListRecord =
            PublicObjectListRecord.builder().listId("listId").objectType("objectType").build()

        assertThat(publicObjectListRecord.listId()).isEqualTo("listId")
        assertThat(publicObjectListRecord.objectType()).isEqualTo("objectType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectListRecord =
            PublicObjectListRecord.builder().listId("listId").objectType("objectType").build()

        val roundtrippedPublicObjectListRecord =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectListRecord),
                jacksonTypeRef<PublicObjectListRecord>(),
            )

        assertThat(roundtrippedPublicObjectListRecord).isEqualTo(publicObjectListRecord)
    }
}
