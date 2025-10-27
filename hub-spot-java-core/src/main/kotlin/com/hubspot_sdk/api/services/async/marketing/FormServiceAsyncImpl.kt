// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

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
import com.hubspot_sdk.api.models.marketing.forms.CollectionResponseFormDefinitionBaseForwardPaging
import com.hubspot_sdk.api.models.marketing.forms.FormCreateParams
import com.hubspot_sdk.api.models.marketing.forms.FormDefinitionBase
import com.hubspot_sdk.api.models.marketing.forms.FormDeleteParams
import com.hubspot_sdk.api.models.marketing.forms.FormListPageAsync
import com.hubspot_sdk.api.models.marketing.forms.FormListParams
import com.hubspot_sdk.api.models.marketing.forms.FormReadParams
import com.hubspot_sdk.api.models.marketing.forms.FormReplaceParams
import com.hubspot_sdk.api.models.marketing.forms.FormUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FormServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FormServiceAsync {

    private val withRawResponse: FormServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FormServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormServiceAsync =
        FormServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FormCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FormDefinitionBase> =
        // post /marketing/v3/forms/
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FormUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FormDefinitionBase> =
        // patch /marketing/v3/forms/{formId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FormListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FormListPageAsync> =
        // get /marketing/v3/forms/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FormDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/v3/forms/{formId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun read(
        params: FormReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FormDefinitionBase> =
        // get /marketing/v3/forms/{formId}
        withRawResponse().read(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: FormReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FormDefinitionBase> =
        // put /marketing/v3/forms/{formId}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FormServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FormServiceAsync.WithRawResponse =
            FormServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun create(
            params: FormCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun update(
            params: FormUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("formId", params.formId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponseFormDefinitionBaseForwardPaging> =
            jsonHandler<CollectionResponseFormDefinitionBaseForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: FormListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", "")
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
                                FormListPageAsync.builder()
                                    .service(FormServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FormDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("formId", params.formId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val readHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun read(
            params: FormReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("formId", params.formId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { readHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun replace(
            params: FormReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormDefinitionBase>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("formId", params.formId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replaceHandler.handle(it) }
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
