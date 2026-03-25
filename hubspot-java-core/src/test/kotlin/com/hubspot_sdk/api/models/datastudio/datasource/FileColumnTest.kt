// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileColumnTest {

    @Test
    fun create() {
        val fileColumn = FileColumn.builder().name("name").type("type").build()

        assertThat(fileColumn.name()).isEqualTo("name")
        assertThat(fileColumn.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileColumn = FileColumn.builder().name("name").type("type").build()

        val roundtrippedFileColumn =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileColumn),
                jacksonTypeRef<FileColumn>(),
            )

        assertThat(roundtrippedFileColumn).isEqualTo(fileColumn)
    }
}
