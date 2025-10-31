// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FunctionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionServiceAsync = client.automation().actions().functions()

        val collectionResponsePublicActionFunctionIdentifierNoPagingFuture =
            functionServiceAsync.list(
                FunctionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        val collectionResponsePublicActionFunctionIdentifierNoPaging =
            collectionResponsePublicActionFunctionIdentifierNoPagingFuture.get()
        collectionResponsePublicActionFunctionIdentifierNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionServiceAsync = client.automation().actions().functions()

        val future =
            functionServiceAsync.delete(
                FunctionDeleteParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionDeleteParams.FunctionType.PRE_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOrReplace() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionIdentifierFuture =
            functionServiceAsync.createOrReplace(
                FunctionCreateOrReplaceParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionCreateOrReplaceParams.FunctionType.PRE_ACTION_EXECUTION)
                    .functionId("functionId")
                    .body("body")
                    .build()
            )

        val publicActionFunctionIdentifier = publicActionFunctionIdentifierFuture.get()
        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOrReplaceByFunctionType() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionIdentifierFuture =
            functionServiceAsync.createOrReplaceByFunctionType(
                FunctionCreateOrReplaceByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionCreateOrReplaceByFunctionTypeParams.FunctionType
                            .PRE_ACTION_EXECUTION
                    )
                    .body("body")
                    .build()
            )

        val publicActionFunctionIdentifier = publicActionFunctionIdentifierFuture.get()
        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteByFunctionType() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionServiceAsync = client.automation().actions().functions()

        val future =
            functionServiceAsync.deleteByFunctionType(
                FunctionDeleteByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionDeleteByFunctionTypeParams.FunctionType.PRE_ACTION_EXECUTION
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionFuture =
            functionServiceAsync.get(
                FunctionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionGetParams.FunctionType.PRE_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        val publicActionFunction = publicActionFunctionFuture.get()
        publicActionFunction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByFunctionType() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionFuture =
            functionServiceAsync.getByFunctionType(
                FunctionGetByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionGetByFunctionTypeParams.FunctionType.PRE_ACTION_EXECUTION)
                    .build()
            )

        val publicActionFunction = publicActionFunctionFuture.get()
        publicActionFunction.validate()
    }
}
