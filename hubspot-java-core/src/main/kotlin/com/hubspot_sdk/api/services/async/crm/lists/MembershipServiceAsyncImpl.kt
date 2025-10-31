// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.crm.lists.ApiCollectionResponseJoinTimeAndRecordId
import com.hubspot_sdk.api.models.crm.lists.ApiCollectionResponseRecordListMembershipNoPaging
import com.hubspot_sdk.api.models.crm.lists.MembershipsUpdateResponse
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAllFromListParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddAndRemoveParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipAddParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetListsParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetPageOrderedByAddedToListDatePageAsync
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipGetPageOrderedByAddedToListDateParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipListPageAsync
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipListParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveAllParams
import com.hubspot_sdk.api.models.crm.lists.memberships.MembershipRemoveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MembershipServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MembershipServiceAsync {

    private val withRawResponse: MembershipServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MembershipServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MembershipServiceAsync =
        MembershipServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: MembershipListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipListPageAsync> =
        // get /crm/v3/lists/{listId}/memberships
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: MembershipAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipsUpdateResponse> =
        // put /crm/v3/lists/{listId}/memberships/add
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun addAllFromList(
        params: MembershipAddAllFromListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/v3/lists/{listId}/memberships/add-from/{sourceListId}
        withRawResponse().addAllFromList(params, requestOptions).thenAccept {}

    override fun addAndRemove(
        params: MembershipAddAndRemoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipsUpdateResponse> =
        // put /crm/v3/lists/{listId}/memberships/add-and-remove
        withRawResponse().addAndRemove(params, requestOptions).thenApply { it.parse() }

    override fun getLists(
        params: MembershipGetListsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiCollectionResponseRecordListMembershipNoPaging> =
        // get /crm/v3/lists/records/{objectTypeId}/{recordId}/memberships
        withRawResponse().getLists(params, requestOptions).thenApply { it.parse() }

    override fun getPageOrderedByAddedToListDate(
        params: MembershipGetPageOrderedByAddedToListDateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipGetPageOrderedByAddedToListDatePageAsync> =
        // get /crm/v3/lists/{listId}/memberships/join-order
        withRawResponse().getPageOrderedByAddedToListDate(params, requestOptions).thenApply {
            it.parse()
        }

    override fun remove(
        params: MembershipRemoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MembershipsUpdateResponse> =
        // put /crm/v3/lists/{listId}/memberships/remove
        withRawResponse().remove(params, requestOptions).thenApply { it.parse() }

    override fun removeAll(
        params: MembershipRemoveAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/v3/lists/{listId}/memberships
        withRawResponse().removeAll(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MembershipServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MembershipServiceAsync.WithRawResponse =
            MembershipServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ApiCollectionResponseJoinTimeAndRecordId> =
            jsonHandler<ApiCollectionResponseJoinTimeAndRecordId>(clientOptions.jsonMapper)

        override fun list(
            params: MembershipListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", params._pathParam(0), "memberships")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MembershipListPageAsync.builder()
                                    .service(MembershipServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val addHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun add(
            params: MembershipAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "memberships",
                        "add",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val addAllFromListHandler: Handler<Void?> = emptyHandler()

        override fun addAllFromList(
            params: MembershipAddAllFromListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sourceListId", params.sourceListId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "memberships",
                        "add-from",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { addAllFromListHandler.handle(it) }
                    }
                }
        }

        private val addAndRemoveHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun addAndRemove(
            params: MembershipAddAndRemoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "memberships",
                        "add-and-remove",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addAndRemoveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getListsHandler: Handler<ApiCollectionResponseRecordListMembershipNoPaging> =
            jsonHandler<ApiCollectionResponseRecordListMembershipNoPaging>(clientOptions.jsonMapper)

        override fun getLists(
            params: MembershipGetListsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiCollectionResponseRecordListMembershipNoPaging>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordId", params.recordId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        "records",
                        params._pathParam(0),
                        params._pathParam(1),
                        "memberships",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getListsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPageOrderedByAddedToListDateHandler:
            Handler<ApiCollectionResponseJoinTimeAndRecordId> =
            jsonHandler<ApiCollectionResponseJoinTimeAndRecordId>(clientOptions.jsonMapper)

        override fun getPageOrderedByAddedToListDate(
            params: MembershipGetPageOrderedByAddedToListDateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipGetPageOrderedByAddedToListDatePageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "memberships",
                        "join-order",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPageOrderedByAddedToListDateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MembershipGetPageOrderedByAddedToListDatePageAsync.builder()
                                    .service(MembershipServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val removeHandler: Handler<MembershipsUpdateResponse> =
            jsonHandler<MembershipsUpdateResponse>(clientOptions.jsonMapper)

        override fun remove(
            params: MembershipRemoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MembershipsUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        params._pathParam(0),
                        "memberships",
                        "remove",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { removeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeAllHandler: Handler<Void?> = emptyHandler()

        override fun removeAll(
            params: MembershipRemoveAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", params._pathParam(0), "memberships")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { removeAllHandler.handle(it) }
                    }
                }
        }
    }
}
