// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.exports.PublicCrmSearchRequest
import com.hubspot_sdk.api.models.crm.exports.PublicExportRequest
import com.hubspot_sdk.api.models.crm.exports.PublicExportViewRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val exportServiceAsync = client.crm().exports()

        val taskLocatorFuture =
            exportServiceAsync.create(
                PublicExportRequest.ofView(
                    PublicExportViewRequest.builder()
                        .addAssociatedObjectType("string")
                        .addExportInternalValuesOption(
                            PublicExportViewRequest.ExportInternalValuesOption.NAMES
                        )
                        .exportName("exportName")
                        .exportType(PublicExportViewRequest.ExportType.VIEW)
                        .format(PublicExportViewRequest.Format.XLS)
                        .includeLabeledAssociations(true)
                        .includePrimaryDisplayPropertyForAssociatedObjects(true)
                        .language(PublicExportViewRequest.Language.EN)
                        .addObjectProperty("string")
                        .objectType("objectType")
                        .overrideAssociatedObjectsPerDefinitionPerRowLimit(true)
                        .publicCrmSearchRequest(
                            PublicCrmSearchRequest.builder()
                                .addFilterGroup(
                                    FilterGroup.builder()
                                        .addFilter(
                                            Filter.builder()
                                                .operator(Filter.Operator.EQ)
                                                .propertyName("")
                                                .highValue("")
                                                .value("")
                                                .addValue("string")
                                                .build()
                                        )
                                        .build()
                                )
                                .addFilter(
                                    Filter.builder()
                                        .operator(Filter.Operator.EQ)
                                        .propertyName("")
                                        .highValue("")
                                        .value("")
                                        .addValue("string")
                                        .build()
                                )
                                .addSort("string")
                                .query("query")
                                .build()
                        )
                        .build()
                )
            )

        val taskLocator = taskLocatorFuture.get()
        taskLocator.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val exportServiceAsync = client.crm().exports()

        val actionResponseWithSingleResultUriFuture = exportServiceAsync.getStatus(0L)

        val actionResponseWithSingleResultUri = actionResponseWithSingleResultUriFuture.get()
        actionResponseWithSingleResultUri.validate()
    }
}
