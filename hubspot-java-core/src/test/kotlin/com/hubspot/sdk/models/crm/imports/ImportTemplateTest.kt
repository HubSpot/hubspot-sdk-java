// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.imports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportTemplateTest {

    @Test
    fun create() {
        val importTemplate =
            ImportTemplate.builder()
                .templateId(0)
                .templateType(ImportTemplate.TemplateType.ADMIN_DEFINED)
                .build()

        assertThat(importTemplate.templateId()).isEqualTo(0)
        assertThat(importTemplate.templateType())
            .isEqualTo(ImportTemplate.TemplateType.ADMIN_DEFINED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val importTemplate =
            ImportTemplate.builder()
                .templateId(0)
                .templateType(ImportTemplate.TemplateType.ADMIN_DEFINED)
                .build()

        val roundtrippedImportTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(importTemplate),
                jacksonTypeRef<ImportTemplate>(),
            )

        assertThat(roundtrippedImportTemplate).isEqualTo(importTemplate)
    }
}
