// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.exports.PublicCrmSearchRequest
import com.hubspot_sdk.api.models.crm.exports.PublicExportRequest
import com.hubspot_sdk.api.models.crm.exports.PublicExportViewRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val exportService = client.crm().exports()

        val taskLocator =
            exportService.create(
                PublicExportRequest.ofView(
                    PublicExportViewRequest.builder()
                        .addExportInternalValuesOption(
                            PublicExportViewRequest.ExportInternalValuesOption.NAMES
                        )
                        .exportName("exportName")
                        .exportType(PublicExportViewRequest.ExportType.VIEW)
                        .format(PublicExportViewRequest.Format.XLS)
                        .language(PublicExportViewRequest.Language.EN)
                        .addObjectProperty("string")
                        .objectType("objectType")
                        .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                        .associatedObjectType("associatedObjectType")
                        .publicCrmSearchRequest(
                            PublicCrmSearchRequest.builder()
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.EQ)
                                        .propertyName("")
                                        .highValue("")
                                        .value("")
                                        .addValue("string")
                                        .build()
                                )
                                .query("query")
                                .addSort("string")
                                .build()
                        )
                        .build()
                )
            )

        taskLocator.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val exportService = client.crm().exports()

        val actionResponseWithSingleResultUri = exportService.getStatus(0L)

        actionResponseWithSingleResultUri.validate()
    }
}
