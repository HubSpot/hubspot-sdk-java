// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditLogExportParamsTest {

    @Test
    fun create() {
        AuditLogExportParams.builder()
            .cmsAuditLoggingExportSettings(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuditLogExportParams.builder()
                .cmsAuditLoggingExportSettings(
                    CmsAuditLoggingExportSettings.builder()
                        .email("email")
                        .format(CmsAuditLoggingExportSettings.Format.CSV)
                        .portalId(0)
                        .addRecipientUserId(0)
                        .shouldMarkExportFileAsSensitive(true)
                        .type("type")
                        .filters(
                            CmsAuditLoggingExportFilters.builder().addObjectType("string").build()
                        )
                        .partition(0)
                        .userId(0)
                        .userTimeZone("userTimeZone")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuditLogExportParams.builder()
                .cmsAuditLoggingExportSettings(
                    CmsAuditLoggingExportSettings.builder()
                        .email("email")
                        .format(CmsAuditLoggingExportSettings.Format.CSV)
                        .portalId(0)
                        .addRecipientUserId(0)
                        .shouldMarkExportFileAsSensitive(true)
                        .type("type")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CmsAuditLoggingExportSettings.builder()
                    .email("email")
                    .format(CmsAuditLoggingExportSettings.Format.CSV)
                    .portalId(0)
                    .addRecipientUserId(0)
                    .shouldMarkExportFileAsSensitive(true)
                    .type("type")
                    .build()
            )
    }
}
