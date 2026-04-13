// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.automation.actions

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot.models.automation.actions.functions.FunctionDeleteByFunctionTypeParams
import com.hubspot.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot.models.automation.actions.functions.FunctionGetParams
import com.hubspot.models.automation.actions.functions.FunctionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FunctionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val functionServiceAsync = client.automation().actions().functions()

        val collectionResponsePublicActionFunctionIdentifierNoPagingFuture =
            functionServiceAsync.list(
                FunctionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        val collectionResponsePublicActionFunctionIdentifierNoPaging =
            collectionResponsePublicActionFunctionIdentifierNoPagingFuture.get()
        collectionResponsePublicActionFunctionIdentifierNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val functionServiceAsync = client.automation().actions().functions()

        val future =
            functionServiceAsync.delete(
                FunctionDeleteParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionDeleteParams.FunctionType.POST_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrReplace() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionIdentifierFuture =
            functionServiceAsync.createOrReplace(
                FunctionCreateOrReplaceParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionCreateOrReplaceParams.FunctionType.POST_ACTION_EXECUTION)
                    .functionId("functionId")
                    .body("body")
                    .build()
            )

        val publicActionFunctionIdentifier = publicActionFunctionIdentifierFuture.get()
        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrReplaceByFunctionType() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionIdentifierFuture =
            functionServiceAsync.createOrReplaceByFunctionType(
                FunctionCreateOrReplaceByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionCreateOrReplaceByFunctionTypeParams.FunctionType
                            .POST_ACTION_EXECUTION
                    )
                    .body("body")
                    .build()
            )

        val publicActionFunctionIdentifier = publicActionFunctionIdentifierFuture.get()
        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByFunctionType() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val functionServiceAsync = client.automation().actions().functions()

        val future =
            functionServiceAsync.deleteByFunctionType(
                FunctionDeleteByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionDeleteByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionFuture =
            functionServiceAsync.get(
                FunctionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionGetParams.FunctionType.POST_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        val publicActionFunction = publicActionFunctionFuture.get()
        publicActionFunction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByFunctionType() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val functionServiceAsync = client.automation().actions().functions()

        val publicActionFunctionFuture =
            functionServiceAsync.getByFunctionType(
                FunctionGetByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionGetByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
                    )
                    .build()
            )

        val publicActionFunction = publicActionFunctionFuture.get()
        publicActionFunction.validate()
    }
}
