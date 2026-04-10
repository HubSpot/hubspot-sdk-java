// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.Filter
import com.hubspot_sdk.api.models.crm.FilterGroup
import com.hubspot_sdk.api.models.crm.exports.PublicCrmSearchRequest
import com.hubspot_sdk.api.models.crm.exports.PublicExportViewRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAsync() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exportServiceAsync = client.crm().exports()

        val taskLocatorFuture =
            exportServiceAsync.createAsync(
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
                                            .operator(Filter.Operator.BETWEEN)
                                            .propertyName("propertyName")
                                            .highValue("highValue")
                                            .value("value")
                                            .addValue("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .addFilter(
                                Filter.builder()
                                    .operator(Filter.Operator.BETWEEN)
                                    .propertyName("propertyName")
                                    .highValue("highValue")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .addSort("string")
                            .query("query")
                            .build()
                    )
                    .build()
            )

        val taskLocator = taskLocatorFuture.get()
        taskLocator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exportServiceAsync = client.crm().exports()

        val publicExportResponseFuture = exportServiceAsync.get(0L)

        val publicExportResponse = publicExportResponseFuture.get()
        publicExportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val exportServiceAsync = client.crm().exports()

        val actionResponseWithSingleResultUriFuture = exportServiceAsync.getStatus(0L)

        val actionResponseWithSingleResultUri = actionResponseWithSingleResultUriFuture.get()
        actionResponseWithSingleResultUri.validate()
    }
}
