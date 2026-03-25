// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportRowCoreTest {

    @Test
    fun create() {
        val importRowCore =
            ImportRowCore.builder()
                .addAdditionalRowData("string")
                .containsEncryptedProperties(true)
                .fileId(0)
                .lineNumber(0)
                .addRowData("string")
                .pageName("pageName")
                .build()

        assertThat(importRowCore.additionalRowData()).containsExactly("string")
        assertThat(importRowCore.containsEncryptedProperties()).isEqualTo(true)
        assertThat(importRowCore.fileId()).isEqualTo(0)
        assertThat(importRowCore.lineNumber()).isEqualTo(0)
        assertThat(importRowCore.rowData()).containsExactly("string")
        assertThat(importRowCore.pageName()).contains("pageName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val importRowCore =
            ImportRowCore.builder()
                .addAdditionalRowData("string")
                .containsEncryptedProperties(true)
                .fileId(0)
                .lineNumber(0)
                .addRowData("string")
                .pageName("pageName")
                .build()

        val roundtrippedImportRowCore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(importRowCore),
                jacksonTypeRef<ImportRowCore>(),
            )

        assertThat(roundtrippedImportRowCore).isEqualTo(importRowCore)
    }
}
