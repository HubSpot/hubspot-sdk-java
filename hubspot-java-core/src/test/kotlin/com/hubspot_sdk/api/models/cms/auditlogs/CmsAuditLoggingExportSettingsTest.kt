// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CmsAuditLoggingExportSettingsTest {

    @Test
    fun create() {
        val cmsAuditLoggingExportSettings =
            CmsAuditLoggingExportSettings.builder()
                .email("email")
                .format(CmsAuditLoggingExportSettings.Format.CSV)
                .portalId(0)
                .addRecipientUserId(0)
                .shouldMarkExportFileAsSensitive(true)
                .type("type")
                .filters(CmsAuditLoggingExportFilters.builder().addObjectType("string").build())
                .partition(0)
                .userId(0)
                .userTimeZone("userTimeZone")
                .build()

        assertThat(cmsAuditLoggingExportSettings.email()).isEqualTo("email")
        assertThat(cmsAuditLoggingExportSettings.format())
            .isEqualTo(CmsAuditLoggingExportSettings.Format.CSV)
        assertThat(cmsAuditLoggingExportSettings.portalId()).isEqualTo(0)
        assertThat(cmsAuditLoggingExportSettings.recipientUserIds()).containsExactly(0)
        assertThat(cmsAuditLoggingExportSettings.shouldMarkExportFileAsSensitive()).isEqualTo(true)
        assertThat(cmsAuditLoggingExportSettings.type()).isEqualTo("type")
        assertThat(cmsAuditLoggingExportSettings.filters())
            .contains(CmsAuditLoggingExportFilters.builder().addObjectType("string").build())
        assertThat(cmsAuditLoggingExportSettings.partition()).contains(0)
        assertThat(cmsAuditLoggingExportSettings.userId()).contains(0)
        assertThat(cmsAuditLoggingExportSettings.userTimeZone()).contains("userTimeZone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cmsAuditLoggingExportSettings =
            CmsAuditLoggingExportSettings.builder()
                .email("email")
                .format(CmsAuditLoggingExportSettings.Format.CSV)
                .portalId(0)
                .addRecipientUserId(0)
                .shouldMarkExportFileAsSensitive(true)
                .type("type")
                .filters(CmsAuditLoggingExportFilters.builder().addObjectType("string").build())
                .partition(0)
                .userId(0)
                .userTimeZone("userTimeZone")
                .build()

        val roundtrippedCmsAuditLoggingExportSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cmsAuditLoggingExportSettings),
                jacksonTypeRef<CmsAuditLoggingExportSettings>(),
            )

        assertThat(roundtrippedCmsAuditLoggingExportSettings)
            .isEqualTo(cmsAuditLoggingExportSettings)
    }
}
