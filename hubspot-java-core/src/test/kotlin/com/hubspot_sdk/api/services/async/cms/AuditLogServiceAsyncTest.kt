// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.auditlogs.CmsAuditLoggingExportFilters
import com.hubspot_sdk.api.models.cms.auditlogs.CmsAuditLoggingExportSettings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuditLogServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val auditLogServiceAsync = client.cms().auditLogs()

        val pageFuture = auditLogServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun export() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val auditLogServiceAsync = client.cms().auditLogs()

        val future =
            auditLogServiceAsync.export(
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

        val response = future.get()
    }
}
