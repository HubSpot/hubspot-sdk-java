// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CmsAuditLoggingExportFiltersTest {

    @Test
    fun create() {
        val cmsAuditLoggingExportFilters =
            CmsAuditLoggingExportFilters.builder().addObjectType("string").build()

        assertThat(cmsAuditLoggingExportFilters.objectType()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cmsAuditLoggingExportFilters =
            CmsAuditLoggingExportFilters.builder().addObjectType("string").build()

        val roundtrippedCmsAuditLoggingExportFilters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cmsAuditLoggingExportFilters),
                jacksonTypeRef<CmsAuditLoggingExportFilters>(),
            )

        assertThat(roundtrippedCmsAuditLoggingExportFilters).isEqualTo(cmsAuditLoggingExportFilters)
    }
}
