// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.marketing.forms.CollectionResponseFormDefinitionBaseForwardPaging
import com.hubspot_sdk.api.models.marketing.forms.FormCreateParams
import com.hubspot_sdk.api.models.marketing.forms.FormDefinitionBase
import com.hubspot_sdk.api.models.marketing.forms.FormDeleteParams
import com.hubspot_sdk.api.models.marketing.forms.FormListPage
import com.hubspot_sdk.api.models.marketing.forms.FormListParams
import com.hubspot_sdk.api.models.marketing.forms.FormReadParams
import com.hubspot_sdk.api.models.marketing.forms.FormReplaceParams
import com.hubspot_sdk.api.models.marketing.forms.FormUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FormServiceImpl internal constructor(private val clientOptions: ClientOptions) : FormService {

    private val withRawResponse: FormService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FormService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormService =
        FormServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FormCreateParams,
        requestOptions: RequestOptions,
    ): FormDefinitionBase =
        // post /marketing/v3/forms/
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: FormUpdateParams,
        requestOptions: RequestOptions,
    ): FormDefinitionBase =
        // patch /marketing/v3/forms/{formId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: FormListParams, requestOptions: RequestOptions): FormListPage =
        // get /marketing/v3/forms/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: FormDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/v3/forms/{formId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun read(params: FormReadParams, requestOptions: RequestOptions): FormDefinitionBase =
        // get /marketing/v3/forms/{formId}
        withRawResponse().read(params, requestOptions).parse()

    override fun replace(
        params: FormReplaceParams,
        requestOptions: RequestOptions,
    ): FormDefinitionBase =
        // put /marketing/v3/forms/{formId}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FormService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FormService.WithRawResponse =
            FormServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun create(
            params: FormCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormDefinitionBase> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun update(
            params: FormUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormDefinitionBase> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseFormDefinitionBaseForwardPaging> =
            jsonHandler<CollectionResponseFormDefinitionBaseForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: FormListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FormListPage.builder()
                            .service(FormServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FormDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val readHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun read(
            params: FormReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormDefinitionBase> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("formId", params.formId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "forms", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { readHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<FormDefinitionBase> =
            jsonHandler<FormDefinitionBase>(clientOptions.jsonMapper)

        override fun replace(
            params: FormReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormDefinitionBase> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
