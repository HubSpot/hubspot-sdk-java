// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.cms.auditlogs.CmsAuditLoggingExportFilters
import com.hubspot_sdk.api.models.cms.auditlogs.CmsAuditLoggingExportSettings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuditLogServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val auditLogService = client.cms().auditLogs()

        val page = auditLogService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun export() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val auditLogService = client.cms().auditLogs()

        auditLogService.export(
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
}
