// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.crm.limits.AssociationRecordLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CalculatedPropertyLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CollectionResponseAssociationLabelLimitResponseNoPaging
import com.hubspot_sdk.api.models.crm.limits.CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging
import com.hubspot_sdk.api.models.crm.limits.CustomObjectLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CustomPropertyLimitResponse
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationLabelLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsByObjectTypeParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsFromObjectsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsToObjectsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCalculatedPropertyLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCustomObjectTypeLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCustomPropertyLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetPipelineLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetRecordLimitsParams
import com.hubspot_sdk.api.models.crm.limits.PipelineLimitResponse
import com.hubspot_sdk.api.models.crm.limits.RecordLimitResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LimitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LimitServiceAsync {

    private val withRawResponse: LimitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LimitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitServiceAsync =
        LimitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAssociationLabelLimits(
        params: LimitGetAssociationLabelLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseAssociationLabelLimitResponseNoPaging> =
        // get /crm/v3/limits/associations/labels
        withRawResponse().getAssociationLabelLimits(params, requestOptions).thenApply { it.parse() }

    override fun getAssociationRecordsLimitsByObjectType(
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationRecordLimitResponse> =
        // get /crm/v3/limits/associations/records/{fromObjectTypeId}/{toObjectTypeId}
        withRawResponse()
            .getAssociationRecordsLimitsByObjectType(params, requestOptions)
            .thenApply { it.parse() }

    override fun getAssociationRecordsLimitsFromObjects(
        params: LimitGetAssociationRecordsLimitsFromObjectsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        // get /crm/v3/limits/associations/records/from
        withRawResponse().getAssociationRecordsLimitsFromObjects(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getAssociationRecordsLimitsToObjects(
        params: LimitGetAssociationRecordsLimitsToObjectsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
        // get /crm/v3/limits/associations/records/{fromObjectTypeId}/to
        withRawResponse().getAssociationRecordsLimitsToObjects(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getCalculatedPropertyLimits(
        params: LimitGetCalculatedPropertyLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CalculatedPropertyLimitResponse> =
        // get /crm/v3/limits/calculated-properties
        withRawResponse().getCalculatedPropertyLimits(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getCustomObjectTypeLimits(
        params: LimitGetCustomObjectTypeLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomObjectLimitResponse> =
        // get /crm/v3/limits/custom-object-types
        withRawResponse().getCustomObjectTypeLimits(params, requestOptions).thenApply { it.parse() }

    override fun getCustomPropertyLimits(
        params: LimitGetCustomPropertyLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomPropertyLimitResponse> =
        // get /crm/v3/limits/custom-properties
        withRawResponse().getCustomPropertyLimits(params, requestOptions).thenApply { it.parse() }

    override fun getPipelineLimits(
        params: LimitGetPipelineLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineLimitResponse> =
        // get /crm/v3/limits/pipelines
        withRawResponse().getPipelineLimits(params, requestOptions).thenApply { it.parse() }

    override fun getRecordLimits(
        params: LimitGetRecordLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordLimitResponse> =
        // get /crm/v3/limits/records
        withRawResponse().getRecordLimits(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimitServiceAsync.WithRawResponse =
            LimitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAssociationLabelLimitsHandler:
            Handler<CollectionResponseAssociationLabelLimitResponseNoPaging> =
            jsonHandler<CollectionResponseAssociationLabelLimitResponseNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getAssociationLabelLimits(
            params: LimitGetAssociationLabelLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "associations", "labels")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAssociationLabelLimitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAssociationRecordsLimitsByObjectTypeHandler:
            Handler<AssociationRecordLimitResponse> =
            jsonHandler<AssociationRecordLimitResponse>(clientOptions.jsonMapper)

        override fun getAssociationRecordsLimitsByObjectType(
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociationRecordLimitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectTypeId", params.toObjectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "limits",
                        "associations",
                        "records",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAssociationRecordsLimitsByObjectTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAssociationRecordsLimitsFromObjectsHandler:
            Handler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            jsonHandler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getAssociationRecordsLimitsFromObjects(
            params: LimitGetAssociationRecordsLimitsFromObjectsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "associations", "records", "from")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAssociationRecordsLimitsFromObjectsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAssociationRecordsLimitsToObjectsHandler:
            Handler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            jsonHandler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getAssociationRecordsLimitsToObjects(
            params: LimitGetAssociationRecordsLimitsToObjectsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fromObjectTypeId", params.fromObjectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "limits",
                        "associations",
                        "records",
                        params._pathParam(0),
                        "to",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAssociationRecordsLimitsToObjectsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getCalculatedPropertyLimitsHandler: Handler<CalculatedPropertyLimitResponse> =
            jsonHandler<CalculatedPropertyLimitResponse>(clientOptions.jsonMapper)

        override fun getCalculatedPropertyLimits(
            params: LimitGetCalculatedPropertyLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CalculatedPropertyLimitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "calculated-properties")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCalculatedPropertyLimitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getCustomObjectTypeLimitsHandler: Handler<CustomObjectLimitResponse> =
            jsonHandler<CustomObjectLimitResponse>(clientOptions.jsonMapper)

        override fun getCustomObjectTypeLimits(
            params: LimitGetCustomObjectTypeLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomObjectLimitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "custom-object-types")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCustomObjectTypeLimitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getCustomPropertyLimitsHandler: Handler<CustomPropertyLimitResponse> =
            jsonHandler<CustomPropertyLimitResponse>(clientOptions.jsonMapper)

        override fun getCustomPropertyLimits(
            params: LimitGetCustomPropertyLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomPropertyLimitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "custom-properties")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCustomPropertyLimitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPipelineLimitsHandler: Handler<PipelineLimitResponse> =
            jsonHandler<PipelineLimitResponse>(clientOptions.jsonMapper)

        override fun getPipelineLimits(
            params: LimitGetPipelineLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PipelineLimitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "pipelines")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPipelineLimitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getRecordLimitsHandler: Handler<RecordLimitResponse> =
            jsonHandler<RecordLimitResponse>(clientOptions.jsonMapper)

        override fun getRecordLimits(
            params: LimitGetRecordLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordLimitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "records")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRecordLimitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
