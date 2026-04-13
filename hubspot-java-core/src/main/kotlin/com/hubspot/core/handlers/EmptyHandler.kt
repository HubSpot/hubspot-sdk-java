@file:JvmName("EmptyHandler")

package com.hubspot.core.handlers

import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
